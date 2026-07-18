package com.varshith.springbootproject.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPortfolioController {

    private String page(String title, String content) {
        return """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>%s</title>
                    <style>
                        * { box-sizing: border-box; }
                        body { margin: 0; font-family: Arial, sans-serif; background: #f4f6f8; color: #1f2933; line-height: 1.6; }
                        .container { width: min(1000px, 92%%); margin: 35px auto; background: white; padding: 32px; border-radius: 12px; box-shadow: 0 4px 18px rgba(0,0,0,.10); }
                        h1 { text-align: center; margin-top: 0; padding-bottom: 16px; border-bottom: 3px solid #1f2933; }
                        h2 { margin: 0 0 8px; }
                        .card { padding: 22px 0; border-bottom: 1px solid #d7dde3; }
                        .card:last-child { border-bottom: none; }
                        .row { margin: 7px 0; }
                        .label { display: inline-block; min-width: 135px; font-weight: bold; }
                        .meta { font-weight: bold; color: #52606d; margin: 8px 0 12px; }
                        ul { padding-left: 24px; }
                        li { margin-bottom: 8px; }
                        .tech { margin-top: 12px; font-weight: bold; }
                        .menu a { display: block; padding: 13px 15px; margin: 10px 0; background: #eef2f6; color: #1f4b6e; text-decoration: none; border-radius: 7px; font-weight: bold; }
                        .menu a:hover { background: #dde7ef; }
                    </style>
                </head>
                <body>
                    <div class="container">
                        <h1>%s</h1>
                        %s
                    </div>
                </body>
                </html>
                """.formatted(title, title, content);
    }

    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String home() {
        return page(
                "Varshith Krishna Mohan Reddy Tummuru - Portfolio",
                """
                <div class="menu">
                    <a href="http://localhost:8080/about">About</a>
                    <a href="http://localhost:8080/skills">Skills</a>
                    <a href="http://localhost:8080/projects">Projects</a>
                    <a href="http://localhost:8080/training">Training</a>
                    <a href="http://localhost:8080/certifications">Certifications</a>
                    <a href="http://localhost:8080/achievements">Achievements</a>
                                        <a href="http://localhost:8080/education">Education</a>

                </div>
                """
        );
    }

    @GetMapping(value = "/about", produces = MediaType.TEXT_HTML_VALUE)
    public String about() {
        return page("Contact Information", """
                <div class="card">
                    <p class="row"><span class="label">Name:</span>Varshith Krishna Mohan Reddy Tummuru</p>
                    <p class="row"><span class="label">LinkedIn:</span>linkedin.com/in/varshith-reddy67</p>
                    <p class="row"><span class="label">Email:</span>varshithreddy6776@gmail.com</p>
                    <p class="row"><span class="label">GitHub:</span>github.com/varshithkrishnamohanreddy</p>
                    <p class="row"><span class="label">Mobile:</span>+91-6281977029</p>
                </div>
                """);
    }

    @GetMapping(value = "/skills", produces = MediaType.TEXT_HTML_VALUE)
    public String skills() {
        return page("Skills", """
                <div class="card"><h2>Languages</h2><p>Python, C++, SQL, Java, JavaScript</p></div>
                <div class="card"><h2>Frameworks / Libraries</h2><p>HTML, CSS, NumPy, Pandas, Matplotlib, Seaborn, SciPy, Flask</p></div>
                <div class="card"><h2>Developer Tools</h2><p>Power BI, MS Excel, GitHub, Jupyter Notebook, VS Code</p></div>
                <div class="card"><h2>Databases</h2><p>MySQL, SQL Server</p></div>
                <div class="card"><h2>Soft Skills</h2><p>Problem-Solving, Adaptability, Teamwork</p></div>
                """);
    }

    @GetMapping(value = "/projects", produces = MediaType.TEXT_HTML_VALUE)
    public String projects() {
        return page("Projects", """
                <div class="card">
                    <h2>1. Agriculture Yield Prediction Model</h2>
                    <p class="meta">GitHub | Nov' 25 – Dec' 25</p>
                    <ul>
                        <li>Developed an interactive Power BI dashboard to analyze and predict agricultural crop yields based on historical data.</li>
                        <li>Designed interactive Power BI dashboards featuring dynamic visualizations to study the impact of factors such as rainfall, area cultivated, season, and crop type on yield.</li>
                        <li>Performed data cleaning, transformation, and modeling using Power Query to ensure data accuracy.</li>
                        <li>Improved agricultural decision-making by 40% through interactive Power BI dashboards.</li>
                    </ul>
                    <p class="tech">Technologies Used: Power BI, Power Query, DAX, Data Visualization, Statistical Analysis</p>
                </div>
                <div class="card">
                    <h2>2. Sales and Profit Data Analysis</h2>
                    <p class="meta">GitHub | Mar' 25 – Apr' 25</p>
                    <ul>
                        <li>Analyzed sales and profit data using Python by applying exploratory data analysis (EDA) and statistical testing to derive actionable business insights.</li>
                        <li>Conducted exploratory data analysis to analyze sales and profit distributions across regions and categories.</li>
                        <li>Generated 35% deeper business insights from sales and profit data through Python-based analysis.</li>
                    </ul>
                    <p class="tech">Technologies Used: Python, Exploratory Data Analysis, Pandas, Matplotlib, Seaborn, SciPy</p>
                </div>
                <div class="card">
                    <h2>3. Real-Time-Air-Quality-Index-Analysis</h2>
                    <p class="meta">GitHub | Jan' 25 – Feb' 25</p>
                    <ul>
                        <li>Built a real-time Air Quality Index (AQI) prediction model using machine learning, applying data preprocessing, feature engineering, and model evaluation to generate actionable environmental insights.</li>
                        <li>Implemented regression and classification models to predict AQI categories based on pollutant concentrations.</li>
                        <li>Improved environmental insights by 45% through data preprocessing and trend analysis using machine learning techniques.</li>
                    </ul>
                    <p class="tech">Technologies Used: Machine Learning, Python, Data Preprocessing, Feature Engineering, Regression</p>
                </div>
                """);
    }

    @GetMapping(value = "/training", produces = MediaType.TEXT_HTML_VALUE)
    public String training() {
        return page("Training", """
                <div class="card">
                    <h2>Mastering Data Structures and Algorithms - LPU CPE</h2>
                    <p class="meta">Jun' 25 – Jul' 25</p>
                    <ul>
                        <li>Gained hands-on experience in Data Structures and Algorithms with a focus on practical implementation.</li>
                        <li>Developed a Traffic Light Queue Simulation using custom priority queues and linked lists for lane-wise vehicle control.</li>
                        <li>Integrated a C++ backend with a web interface to visualize simulated traffic operations.</li>
                    </ul>
                    <p class="tech">Technologies Used: DSA, C++, VS Code</p>
                </div>
                """);
    }

    @GetMapping(value = "/certifications", produces = MediaType.TEXT_HTML_VALUE)
    public String certifications() {
        return page("Certifications", """
                <div class="card"><h2>1. Advanced Automation Professional</h2><p class="row"><span class="label">Organization:</span>Automation Anywhere</p><p class="row"><span class="label">Date:</span>Jun' 26</p><p class="row"><span class="label">Link:</span>Certificate Link</p></div>
                <div class="card"><h2>2. Oracle Cloud Infrastructure 2025 Certified AI Foundations Associate</h2><p class="row"><span class="label">Organization:</span>Oracle</p><p class="row"><span class="label">Date:</span>May' 26</p><p class="row"><span class="label">Link:</span>Certificate Link</p></div>
                <div class="card"><h2>3. Python Essentials 1</h2><p class="row"><span class="label">Organization:</span>Cisco Networking Academy</p><p class="row"><span class="label">Date:</span>Nov' 25</p><p class="row"><span class="label">Link:</span>Certificate Link</p></div>
                <div class="card"><h2>4. Multicloud Network Associate</h2><p class="row"><span class="label">Organization:</span>Aviatrix</p><p class="row"><span class="label">Date:</span>Nov' 25</p><p class="row"><span class="label">Link:</span>Certificate Link</p></div>
                <div class="card"><h2>5. Introduction to Hardware and Operating Systems</h2><p class="row"><span class="label">Organization:</span>Coursera</p><p class="row"><span class="label">Date:</span>Sep' 24</p><p class="row"><span class="label">Link:</span>Certificate Link</p></div>
                <div class="card"><h2>6. Excel Skills Job Simulation</h2><p class="row"><span class="label">Organization:</span>Forage</p><p class="row"><span class="label">Date:</span>Nov' 23</p><p class="row"><span class="label">Link:</span>Certificate Link</p></div>
                """);
    }

    @GetMapping(value = "/achievements", produces = MediaType.TEXT_HTML_VALUE)
    public String achievements() {
        return page("Achievements", """
                <div class="card">
                    <h2>Binary Bliaz Hackathon</h2>
                    <p class="meta">Feb' 24</p>
                    <p>Secured a Top 10 Finalist position in the Binary Bliaz Hackathon organized by the School of Computer Science and Engineering, Lovely Professional University.</p>
                </div>
                """);
    }

    @GetMapping(value = "/education", produces = MediaType.TEXT_HTML_VALUE)
    public String education() {
        return page("Education", """
                <div class="card"><h2>1. Lovely Professional University</h2><p class="row"><span class="label">Location:</span>Phagwara, Punjab</p><p class="row"><span class="label">Qualification:</span>Bachelor of Technology</p><p class="row"><span class="label">Branch:</span>Computer Science and Engineering</p><p class="row"><span class="label">CGPA:</span>7.04</p><p class="row"><span class="label">Duration:</span>Since Aug' 23</p></div>
                <div class="card"><h2>2. Narayana Junior College</h2><p class="row"><span class="label">Location:</span>Vijayawada, Andhra Pradesh</p><p class="row"><span class="label">Qualification:</span>Intermediate</p><p class="row"><span class="label">Percentage:</span>96%</p><p class="row"><span class="label">Duration:</span>Jun' 21 – Mar' 23</p></div>
                <div class="card"><h2>3. Geethanjali EM High School</h2><p class="row"><span class="label">Location:</span>Reddygudem, Andhra Pradesh</p><p class="row"><span class="label">Qualification:</span>Matriculation</p><p class="row"><span class="label">Percentage:</span>92%</p><p class="row"><span class="label">Duration:</span>Jun' 20 – Jun' 21</p></div>
                """);
    }
}