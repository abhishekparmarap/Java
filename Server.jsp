package com.company;
        String name = request.getParameter("name");
        String mobile = request.getParameter("mobile");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");

        // Set content type of the response to HTML-->
        response.setContentType("text/html");

       // Create HTML response-->
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Sign Up Details</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Sign Up Details</h2>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Mobile Number: " + mobile + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("<p>Gender: " + gender + "</p>");
        out.println("</body>");
        out.println("</html>");
