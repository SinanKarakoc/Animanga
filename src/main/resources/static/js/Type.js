var myApp = angular.module('AnimangaApplication', [])
    .controller('TypeController',
        function ($scope, $http) {

            $scope.type = {};
            $scope.typeList = [];

            $scope.pageOpen = function () {
                $scope.getTypeList();
            }

            $scope.getTypeList = function () {
                var res = $http.get('api/type/getAll');
                res.then(function (response) {
                    $scope.typeList = response.data;
                })
            }

        })