describe('Tests CoreSync', function() {

	var util = MY.Core.Utils;

	describe('Tests urlPerser', function() {

		var url, obj = {};

		beforeEach(function() {
			obj.id = '1';
		});
		afterEach(function() {

		});

		it('', function() {
			expect(util.urlPerser('/{id}/', obj)).toBe('/1/');
		});
	});
});