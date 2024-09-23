window.addEventListener('scroll', function() {
    let sections = document.querySelectorAll('section');
    let navLinks = document.querySelectorAll('.nav-link');
  
    sections.forEach((section, i) => {
      let rect = section.getBoundingClientRect();
      
      if (rect.top >= 0 && rect.top <= window.innerHeight / 2) {
        navLinks.forEach(link => link.classList.remove('active'));
        navLinks[i].classList.add('active');
      }
    });
  });
  

