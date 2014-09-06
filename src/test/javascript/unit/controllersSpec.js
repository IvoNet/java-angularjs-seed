'use strict';

/* jasmine specs for controllers go here */

describe('Controller tests', function () {

   describe('HomeController', function () {
      var scope, ctrl;

      beforeEach(module('app'));
      beforeEach(inject(function ($rootScope, $controller) {
         scope = $rootScope.$new();
         ctrl = $controller('HomeController', {$scope: scope});
      }));


       it('should contain hello', function () {
         expect(scope.title).toBe('Hello ');
      });
   });
});
