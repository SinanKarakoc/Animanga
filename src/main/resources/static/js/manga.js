var myApp = angular.module('AnimangaApplication', [])
    .controller('MangaController',
        function ($scope, $http) {

            $scope.pageOpen = function () {
                $scope.getMangaList();
            }

            $scope.getMangaList = function () {
                var res = $http.get("api/manga/getAll");
                res.then(function (response) {
                    $scope.mangaList = response.data;
                })
            }

            $scope.save = function () {
                var manga = $http.post("/api/manga/save", $scope.manga)
                manga.then(function (response) {
                    alert(response.data);
                    $scope.getMangaList();
                });
            }

            $scope.selectManga = function (manga) {
                $scope.manga = manga;
            }

            $scope.deleteManga = function (m)
            {
                $scope.manga=m;
                var asd = $http.post("/api/manga/del",$scope.manga)
                asd.then(function (data)
                {
                    $scope.manga = {};
                    $scope.getMangaList();
                })
            }
        });

