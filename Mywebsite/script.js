document.addEventListener("DOMContentLoaded", function () {
    const form = document.querySelector("form");

    form.addEventListener("submit", async function (e) {
        e.preventDefault(); // Prevent default form submission

        const formData = {
            name: form.querySelector("input[name='name']").value.trim(),
            email: form.querySelector("input[name='email']").value.trim(),
            message: form.querySelector("textarea[name='message']").value.trim()
        };

        try {
            const response = await fetch("http://localhost:8080/api/contact", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify(formData)
            });

            if (response.ok) {
                alert("Message sent successfully!");
                form.reset(); // Clear the form
            } else {
                alert("Failed to send message. Please try again.");
            }
        } catch (error) {
            console.error("Error:", error);
            alert("Error occurred while sending message.");
        }
    });
});
