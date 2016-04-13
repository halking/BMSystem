$(function() {
	var i = 0;
	var clone = $(".conimg .banner li").first().clone();
	$(".conimg .banner").append(clone);
	var size = $(".conimg .banner li").size();
	for (var j = 0; j < size - 1; j++) {
		$(".conimg .num").append("<li></li>");
	}
	$(".conimg .num li").first().addClass("on");
	$(".conimg .explain li").first().addClass("on");
	//向左的按钮
	$(".conimg .btn_r").click(function() {
		moveL();
	});
	/*向右按钮*/
	$(".conimg .btn_l").click(function() {
		moveR();
	});
	//鼠标划入圆点
	$(".conimg .explain li").hover(function() {
		var index = $(this).index();
		i = index;
		$(this).addClass("on").siblings().removeClass("on");
		$(".conimg .banner").stop().animate({
			left: -index * 1500
		}, 500);
	});

	//自动轮播
	var t = setInterval(function() {
		moveL();
	}, 3000);
	//对banner定时器的操作
	$(".conimg").hover(function() {
		clearInterval(t);
	}, function() {
		t = setInterval(function() {
			moveL();
		}, 3000);
	})

	function moveL() {
		i++;
		if (i == size) {
			$(".conimg .banner").css({
				left: 0
			});
			i = 1;
		}
		$(".conimg .banner").stop().animate({
			left: -i * 1500
		}, 500);
		if (i == size - 1) {
			$(".conimg .num li").eq(0).addClass("on").siblings().removeClass("on");
			$(".conimg .explain li").eq(0).addClass("on").siblings().removeClass("on");
		} else {
			$(".conimg  .num li").eq(i).addClass("on").siblings().removeClass("on");
			$(".conimg  .explain li").eq(i).addClass("on").siblings().removeClass("on");
		}
	}

	function moveR() {
		i--;
		if (i == -1) {
			$(".conimg .banner").css({
				left: -(size - 1) * 1500
			});
			i = size - 2;
		}
		$(".conimg .banner").stop().animate({
			left: -i * 1500
		}, 500);
		$(".conimg .num li").eq(i).addClass("on").siblings().removeClass("on");
		$(".conimg .explain li").eq(i).addClass("on").siblings().removeClass("on");
	}
	$("#find").click(function(){
		$("#find").attr("href","BMSystem/books/findname?bookname="+$("#bn").val());
	});
});
$(document).ready(function() {
	$("#find").on("click", function() {
		$.ajax({
              type:"GET",
              url:"${ctx}/books/findname",
              data: { bookname:$("#bn").val()},
              success:function(){
              	$("#ifmain").css("src", "${ctx}/books/findname");
              }
			}
		)
	})

});