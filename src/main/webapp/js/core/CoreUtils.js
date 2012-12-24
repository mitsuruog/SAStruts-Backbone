MY.Core.Utils = {
	urlPerser: function(url, args){

		var ret, pattern = '正規表現';

		var matcher = new RegExp(pattern, 'g');

		url.replace(matcher, function(match){
			console.log(match);
		});
	}
};