var myApp = angular.module('AnimangaApplication', [])
    .controller('MangaController',
        function ($scope, $http) {
            //
            //
            // $scope.manga = {};
            // $scope.mangaList = [];
            //
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
            // $scope.deleteManga = function(stu, index) {
            //     var retval = MangaService.deleteManga().then(function(msg) {
            //         $scope.students.splice(index, 1);
            //         // alert('Student has been deleted successfully.');
            //     }).error(function() {
            //         alert('Oops! something went wrong.');
            //     });
            // !!!!!!!!!!!!!delete eklenecek!!!!!!!!!!!!!!!!!!!
            // }


        });

