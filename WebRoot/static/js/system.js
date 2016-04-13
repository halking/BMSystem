$(function(){
	$(".item li>p").click(function(){
	     var now =$(this).nextAll("ul");
	     now.toggle();
	});
	$(".item li>p").hover(function(){
		 var now = $(this).children("i");
		 now.css("color","#ffffff");
	},function(){
		 var now = $(this).children("i");
		  now.css("color","#838B8B");
	});
});
