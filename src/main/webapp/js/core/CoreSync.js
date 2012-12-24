function(){

MY.Core.Syncs.origin = Backbone.sync;

MY.Core.Syncs.CoreSync = Backbone.sync = function(method, model, options) {

	var type = methodMap[method];

	// Default options, unless specified.
	options || (options = {});

	// Default JSON-request options.
	var params = {type: type, dataType: 'json'};

	// Ensure that we have a URL.
	if (!options.url) {
		params.url = getValue(model, 'url') || urlError();
	}

	// Ensure that we have the appropriate request data.
	if (!options.data && model && (method == 'create' || method == 'update')) {
		params.data = model.toJSON();
	}

	if (type === 'PUT' || type === 'DELETE') {
		params.type = 'POST';
		params.beforeSend = function(xhr) {
			xhr.setRequestHeader('X-HTTP-Method-Override', type);
		};
	}

	// Make the request, allowing the user to override any Ajax options.
	return $.ajax(_.extend(params, options));

	function urlParser(model, method){



	}

}();