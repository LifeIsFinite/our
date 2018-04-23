$(document).ready(function() {
	initBack();
});
//初始化背景
function initBack() {
	var victor = new Victor("container", "output");
	var theme = [ [ "#002c4a", "#005584" ], [ "#35ac03", "#3f4303" ],
			[ "#ac0908", "#cd5726" ], [ "#18bbff", "#00486b" ] ];
	$(".color li").each(function(index, val) {
		var color = theme[index];
		$(this).mouseover(function() {
			victor(color).set();
		})
	});
}