console.log("theme.js loaded");
document.addEventListener("DOMContentLoaded", () => {
	console.log("DOM ready");
console.log("toggle element:", document.getElementById("themeToggle"));

    const toggle = document.getElementById("themeToggle");
    if (!toggle) return;

    if (localStorage.getItem("theme") === "dark") {
        document.body.classList.add("dark");
        toggle.textContent = "☀️";
    }

    toggle.addEventListener("click", (e) => {
    e.preventDefault();
    e.stopPropagation();

    document.body.classList.toggle("dark");

    const isDark = document.body.classList.contains("dark");
    toggle.textContent = isDark ? "☀️" : "🌙";
    localStorage.setItem("theme", isDark ? "dark" : "light");
});

});
