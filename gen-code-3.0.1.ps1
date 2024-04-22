# Swagger 2
java -jar swagger-codegen-cli-2.jar generate -i .\openapi.3.0.1.json -l java -o openapi.3.0.1\swagger-2\java --git-repo-id ptv-api-client-swagger-java --git-user-id thanhan910
java -jar swagger-codegen-cli-2.jar generate -i .\openapi.3.0.1.json -l csharp -o openapi.3.0.1\swagger-2\csharp --git-repo-id ptv-api-client-swagger-csharp --git-user-id thanhan910
java -jar swagger-codegen-cli-2.jar generate -i .\openapi.3.0.1.json -l python -o openapi.3.0.1\swagger-2\python --git-repo-id ptv-api-client-swagger-python --git-user-id thanhan910
java -jar swagger-codegen-cli-2.jar generate -i .\openapi.3.0.1.json -l php -o openapi.3.0.1\swagger-2\php --git-repo-id ptv-api-client-swagger-php --git-user-id thanhan910
java -jar swagger-codegen-cli-2.jar generate -i .\openapi.3.0.1.json -l typescript-fetch -o openapi.3.0.1\swagger-2\typescript-fetch --git-repo-id ptv-api-client-swagger-typescript-fetch --git-user-id thanhan910
# Swagger 3
java -jar swagger-codegen-cli-3.jar generate -i .\openapi.3.0.1.json -l java -o openapi.3.0.1\swagger-3\java --git-repo-id ptv-api-client-swagger-java --git-user-id thanhan910
java -jar swagger-codegen-cli-3.jar generate -i .\openapi.3.0.1.json -l csharp -o openapi.3.0.1\swagger-3\csharp --git-repo-id ptv-api-client-swagger-csharp --git-user-id thanhan910
java -jar swagger-codegen-cli-3.jar generate -i .\openapi.3.0.1.json -l python -o openapi.3.0.1\swagger-3\python --git-repo-id ptv-api-client-swagger-python --git-user-id thanhan910
java -jar swagger-codegen-cli-3.jar generate -i .\openapi.3.0.1.json -l php -o openapi.3.0.1\swagger-3\php --git-repo-id ptv-api-client-swagger-php --git-user-id thanhan910
java -jar swagger-codegen-cli-3.jar generate -i .\openapi.3.0.1.json -l typescript-fetch -o openapi.3.0.1\swagger-3\typescript-fetch --git-repo-id ptv-api-client-swagger-typescript-fetch --git-user-id thanhan910
# OpenAPI
java -jar openapi-generator-cli.jar generate -i .\openapi.3.0.1.json -g java -o openapi.3.0.1\openapi\java --git-repo-id ptv-api-client-openapi-java --git-user-id thanhan910 --package-name com.ptv.api.client
java -jar openapi-generator-cli.jar generate -i .\openapi.3.0.1.json -g csharp -o openapi.3.0.1\openapi\csharp --git-repo-id ptv-api-client-openapi-csharp --git-user-id thanhan910 --package-name Ptv.Api.Client
java -jar openapi-generator-cli.jar generate -i .\openapi.3.0.1.json -g python -o openapi.3.0.1\openapi\python --git-repo-id ptv-api-client-openapi-python --git-user-id thanhan910 --package-name ptv_api_client
java -jar openapi-generator-cli.jar generate -i .\openapi.3.0.1.json -g php -o openapi.3.0.1\openapi\php --git-repo-id ptv-api-client-openapi-php --git-user-id thanhan910 --package-name ptv-api-client
java -jar openapi-generator-cli.jar generate -i .\openapi.3.0.1.json -g typescript-fetch -o openapi.3.0.1\openapi\typescript-fetch --git-repo-id ptv-api-client-openapi-php --git-user-id thanhan910


# # Swagger 2 vs 3
# java -jar swagger-codegen-cli-3.jar generate -i .\openapi.3.0.1.json -l java -o openapi.3.0.1\swagger\java --git-repo-id ptv-api-client-swagger-java --git-user-id thanhan910
# java -jar swagger-codegen-cli-3.jar generate -i .\openapi.3.0.1.json -l csharp -o openapi.3.0.1\swagger\csharp --git-repo-id ptv-api-client-swagger-csharp --git-user-id thanhan910
# java -jar swagger-codegen-cli-3.jar generate -i .\openapi.3.0.1.json -l python -o openapi.3.0.1\swagger\python --git-repo-id ptv-api-client-swagger-python --git-user-id thanhan910
# java -jar swagger-codegen-cli-3.jar generate -i .\openapi.3.0.1.json -l php -o openapi.3.0.1\swagger\php --git-repo-id ptv-api-client-swagger-php --git-user-id thanhan910
# java -jar swagger-codegen-cli-3.jar generate -i .\openapi.3.0.1.json -l typescript-fetch -o openapi.3.0.1\swagger\typescript-fetch --git-repo-id ptv-api-client-swagger-typescript-fetch --git-user-id thanhan910


# java -jar swagger-codegen-cli-2.jar langs
# Available languages: [ada, ada-server, akka-scala, android, apache2, apex, aspnetcore, bash, csharp, clojure, cwiki, cpprest, csharp-dotnet2, dart, dart-jaguar, elixir, elm, eiffel, erlang-client, erlang-server, finch, flash, python-flask, go, go-server, groovy, haskell-http-client, haskell, jmeter, jaxrs-cxf-client, jaxrs-cxf, java, inflector, jaxrs-cxf-cdi, jaxrs-spec, jaxrs, msf4j, java-pkmst, java-play-framework, jaxrs-resteasy-eap, jaxrs-resteasy, javascript, javascript-closure-angular, java-vertx, kotlin, lua, lumen, nancyfx, nodejs-server, objc, perl, php, powershell, pistache-server, python, qt5cpp, r, rails5, restbed, ruby, rust, rust-server, scala, scala-lagom-server, scalatra, scalaz, php-silex, sinatra, slim, spring, dynamic-html, html2, html, swagger, swagger-yaml, swift5, swift4, swift3, swift, php-symfony, tizen, typescript-aurelia, typescript-angular, typescript-inversify, typescript-angularjs, typescript-fetch, typescript-jquery, typescript-node, ue4cpp, undertow, ze-ph, kotlin-server]

# java -jar swagger-codegen-cli-3.jar langs
# 16:36:25.482 [Thread-0] INFO  i.s.c.v.g.t.AbstractTypeScriptClientCodegen - Template folder: null
# 16:36:25.484 [Thread-0] INFO  i.s.c.v.g.t.AbstractTypeScriptClientCodegen - Template engine: io.swagger.codegen.v3.templates.HandlebarTemplateEngine@4bb22ac6
# Available languages: [dart, aspnetcore, csharp, csharp-dotnet2, go, go-server, dynamic-html, html, html2, java, jaxrs-cxf-client, jaxrs-cxf, inflector, jaxrs-cxf-cdi, jaxrs-spec, jaxrs-jersey, jaxrs-di, jaxrs-resteasy-eap, jaxrs-resteasy, java-vertx, micronaut, spring, nodejs-server, openapi, openapi-yaml, kotlin-client, kotlin-server, php, python, python-flask, r, ruby, scala, scala-akka-http-server, swift3, swift4, swift5, typescript-angular, typescript-axios, typescript-fetch, javascript]

# java -jar openapi-generator-cli.jar list
# The following generators are available:

# CLIENT generators:
#     - ada
#     - android
#     - apex
#     - bash
#     - c
#     - clojure
#     - cpp-qt-client
#     - cpp-restsdk
#     - cpp-tiny (beta)
#     - cpp-tizen
#     - cpp-ue4 (beta)
#     - crystal (beta)
#     - csharp
#     - dart
#     - dart-dio
#     - eiffel
#     - elixir
#     - elm
#     - erlang-client
#     - erlang-proper
#     - go
#     - groovy
#     - haskell-http-client
#     - java
#     - java-helidon-client (beta)
#     - java-micronaut-client (beta)
#     - javascript
#     - javascript-closure-angular
#     - javascript-flowtyped
#     - jaxrs-cxf-client
#     - jetbrains-http-client (experimental)
#     - jmeter
#     - julia-client (beta)
#     - k6 (beta)
#     - kotlin
#     - lua (beta)
#     - n4js (beta)
#     - nim (beta)
#     - objc
#     - ocaml
#     - perl
#     - php
#     - php-dt (beta)
#     - php-nextgen (beta)
#     - powershell (beta)
#     - python
#     - python-pydantic-v1
#     - r
#     - ruby
#     - rust
#     - scala-akka
#     - scala-gatling
#     - scala-pekko
#     - scala-sttp
#     - scala-sttp4 (beta)
#     - scalaz
#     - swift-combine
#     - swift5
#     - typescript (experimental)
#     - typescript-angular
#     - typescript-aurelia
#     - typescript-axios
#     - typescript-fetch
#     - typescript-inversify
#     - typescript-jquery
#     - typescript-nestjs (experimental)
#     - typescript-node
#     - typescript-redux-query
#     - typescript-rxjs
#     - xojo-client
#     - zapier (beta)


# SERVER generators:
#     - ada-server
#     - aspnetcore
#     - cpp-pistache-server
#     - cpp-qt-qhttpengine-server
#     - cpp-restbed-server
#     - cpp-restbed-server-deprecated
#     - csharp-functions
#     - erlang-server
#     - fsharp-functions (beta)
#     - fsharp-giraffe-server (beta)
#     - go-echo-server (beta)
#     - go-gin-server
#     - go-server
#     - graphql-nodejs-express-server
#     - haskell
#     - haskell-yesod (beta)
#     - java-camel
#     - java-helidon-server (beta)
#     - java-inflector
#     - java-micronaut-server (beta)
#     - java-msf4j
#     - java-pkmst
#     - java-play-framework
#     - java-undertow-server
#     - java-vertx-web (beta)
#     - java-wiremock (beta)
#     - jaxrs-cxf
#     - jaxrs-cxf-cdi
#     - jaxrs-cxf-extended
#     - jaxrs-jersey
#     - jaxrs-resteasy
#     - jaxrs-resteasy-eap
#     - jaxrs-spec
#     - julia-server (beta)
#     - kotlin-server
#     - kotlin-spring
#     - kotlin-vertx (beta)
#     - nodejs-express-server (beta)
#     - php-laravel
#     - php-lumen
#     - php-mezzio-ph
#     - php-slim4
#     - php-symfony
#     - python-aiohttp
#     - python-blueplanet
#     - python-fastapi (beta)
#     - python-flask
#     - ruby-on-rails
#     - ruby-sinatra
#     - rust-axum (beta)
#     - rust-server
#     - scala-akka-http-server (beta)
#     - scala-cask
#     - scala-finch
#     - scala-http4s-server
#     - scala-lagom-server
#     - scala-play-server
#     - scalatra
#     - spring


# DOCUMENTATION generators:
#     - asciidoc
#     - cwiki
#     - dynamic-html
#     - html
#     - html2
#     - markdown (beta)
#     - openapi
#     - openapi-yaml
#     - plantuml (beta)


# SCHEMA generators:
#     - avro-schema (beta)
#     - graphql-schema
#     - ktorm-schema (beta)
#     - mysql-schema
#     - postman-collection (beta)
#     - protobuf-schema (beta)
#     - wsdl-schema (beta)


# CONFIG generators:
#     - apache2