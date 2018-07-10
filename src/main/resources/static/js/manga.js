var myApp = angular.module('AnimangaApplication',[])
    .controller('MangaController',
        function ($scope, $http) {


            $scope.manga = {};
            $scope.mangaList=[];


            $scope.pageOpen = function () {
                $scope.getMangaList();
            }

            $scope.getMangaList = function () {
                var res=$http.get('api/manga/getAll');
                res.then(function (response) {
                    $scope.mangaList = response.data;
                })
            }

        });
