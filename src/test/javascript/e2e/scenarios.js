'use strict';

/* http://docs.angularjs.org/guide/dev_guide.e2e-testing */

describe('App integration tests', function () {
   beforeEach(function () {
      browser.get('/index.html');
   });

   it('should redirect index.html to index.html#/', function () {
      browser.getLocationAbsUrl().then(function (url) {
         expect(url.split('#')[1]).toBe('/');
      });
   });
});