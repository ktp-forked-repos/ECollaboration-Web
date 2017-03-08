/**
 * Created by dailybird on 16/8/24.
 */
(function($){
    $.fn.footer = function(){
        (function(element){
            // 重置上外边距
            var $footer = element;
            element.css('visibility', 'hidden');
            // 获取相邻元素
            var $prev = $footer.prev();
            // 相邻元素的底端坐标( 考虑 margin 值 )
            // var prevBottomPosition = $prev.offset().top - parseInt($prev.css('margin-top')) + $prev.outerHeight(true);
            // console.log(prevBottomPosition);
            // footer元素的顶端坐标( 考虑 margin 值 ), 结果与 prevBottomPosition 相同
            var footerTopPosition = $footer.offset().top - parseInt($footer.css('margin-top'));
            // 计算 footer 的高度值, 这里不考虑外边距, 只考虑内边距和边框
            var footerHeight = $footer.outerHeight();
            // 获取不作调整时的 footer 底端坐标
            $footer.css('margin-bottom', 0); // footer 元素不应具有下边距
            var predictBottomPosition = $footer.offset().top + footerHeight;
            // 计算浏览器高度值
            var windowHeight = $(window).height();

            if(predictBottomPosition < windowHeight){
                var offset = windowHeight - footerTopPosition - footerHeight;
                //console.log(windowHeight , footerTopPosition , footerHeight);
                $footer.css('margin-top', offset + 'px');
            }
            element.css('visibility', 'visible');
        })($(this));
    }
})(jQuery);