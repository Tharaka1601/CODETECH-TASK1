var typed = new Typed(".text", {
    strings: ["Frontend Developer", "Programmer", "Web Developer"],
    typeSpeed: 100,
    backSpeed: 100,
    backDelay: 1000,
    loop: true
});

document.getElementById('contactForm').addEventListener('submit', function(e) {
    e.preventDefault();
    alert('Message sent! Thank you for contacting me.');
    this.reset(); // Reset the form after submission
});
