var controllers = angular.module("controllers", []);

controllers.controller("HomeController", ['$scope', '$http', function ($scope, $http) {
    $scope.debug = false;
    $scope.title = 'Hello ';

    $http.get("service/home").success(function (data) {
        $scope.data = data;
        $scope.title += $scope.data.message;
    });

    $scope.toggleDebug = function () {
        $scope.debug = !$scope.debug;
    };
}]);