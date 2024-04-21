import subprocess
import requests
import json
import os

if __name__ == "__main__":

    current_dir = os.path.dirname(os.path.realpath(__file__))
    # output_dir = os.path.join(current_dir, "../swagger-codegen")
    output_dir = current_dir
    os.makedirs(output_dir, exist_ok=True)
    jar_file = os.path.join(output_dir, "swagger-codegen.jar")
    swagger_file = os.path.join(output_dir, "swagger.json")

    languages = [
        "dart",
        "aspnetcore",
        "csharp",
        "csharp-dotnet2",
        "go",
        "go-server",
        "dynamic-html",
        "html",
        "html2",
        "java",
        "jaxrs-cxf-client",
        "jaxrs-cxf",
        "inflector",
        "jaxrs-cxf-cdi",
        "jaxrs-spec",
        "jaxrs-jersey",
        "jaxrs-di",
        "jaxrs-resteasy-eap",
        "jaxrs-resteasy",
        "java-vertx",
        "micronaut",
        "spring",
        "nodejs-server",
        "openapi",
        "openapi-yaml",
        "kotlin-client",
        "kotlin-server",
        "php",
        "python",
        "python-flask",
        "r",
        "ruby",
        "scala",
        "scala-akka-http-server",
        "swift3",
        "swift4",
        "swift5",
        "typescript-angular",
        "typescript-axios",
        "typescript-fetch",
        "javascript",
    ]

    # Generate jar file
    if not os.path.exists(jar_file):

        maven_url = "https://repo1.maven.org/maven2/io/swagger/codegen/v3/swagger-codegen-cli/3.0.52/swagger-codegen-cli-3.0.52.jar"

        if os.name == 'posix':
            # If linux, use wget
            subprocess.run(["wget", "-O", jar_file, maven_url], check=True)
        elif os.name == 'nt':
            # If windows, use powershell Invoke-WebRequest
            subprocess.run(["powershell", "-Command", "Invoke-WebRequest", "-OutFile", jar_file, maven_url], check=True)
        elif os.name == 'darwin':
            # If mac, use brew
            subprocess.run(["brew", "install", "swagger-codegen"])


    for language in languages:
        output_file = os.path.join(output_dir, language)
        subprocess.run(["java", "-jar", jar_file, "generate", "-i", swagger_file, "-l", language, "-o", output_file], check=True)

