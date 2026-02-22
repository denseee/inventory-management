document.addEventListener("DOMContentLoaded", () => {
    document.querySelectorAll("form").forEach(form => {
        form.addEventListener("submit", () => {
            const btn = form.querySelector("button[type='submit']");
            if (!btn) return;

            btn.dataset.originalText = btn.innerHTML;
            btn.innerHTML = btn.dataset.loadingText || "Loading...";
            btn.disabled = true;
        });
    });
});
