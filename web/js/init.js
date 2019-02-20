(function($) {
    $(function() {

        $('.sidenav').sidenav();
        $('.parallax').parallax();
        $('.carousel.carousel-slider').carousel({
            fullWidth: true,
            indicators: true
        });
        $(document).ready(function() {
            $('.slider').slider();
        });
    }); // end of document ready
})(jQuery); // end of jQuery name space
