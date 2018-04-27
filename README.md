<h1>Spring Cloud Consul</h1>

1. Download Consul https://www.consul.io/downloads.html.
2. Run agent "consul agent -dev"
3. Add key value in consul ui(http://localhost:8500/ui/#/dc1/kv/) key - "/config/myApp/my/prop" value - my property from consul
4. Run SpringBootApplication and get you property from rest
