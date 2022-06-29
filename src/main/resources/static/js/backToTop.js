(function backToTop() {
    'use strict';

    var goTopBtn = document.querySelector('.back_to_top');
    function trackScroll() {
        let scrolled = window.pageYOffset;
        let coords = document.documentElement.clientHeight;

        if (scrolled > coords) {
            goTopBtn.classList.add('back_to_top-show');
        }
        if (scrolled < coords) {
            goTopBtn.classList.remove('back_to_top-show');
        }
    }

    function backToTop() {
        if (window.pageYOffset > 500) {
            window.scrollTo({ top: 0, behavior: 'smooth' });
            setTimeout(backToTop, 0);
        }
    }
    window.addEventListener('scroll', trackScroll);
    goTopBtn.addEventListener('click', backToTop);
})();