<a name="readme-top"></a>
<br />
<div align="center">
<a href="https://github.com/YMSAISolutionDev1/yms-mvds">
<img src="connector-ui/src/assets/images/ymatics_logo.svg" alt="Logo" width="300">
</a>
</div>

<h3 align="center">Ymatics Connector</h3>
<p align="center" style="padding-bottom:16px">
Extended EDC Connector by Ymatics.

## About The Project

[Eclipse Dataspace Components](https://github.com/eclipse-edc) (EDC) is a framework
for building dataspaces, exchanging data securely with ensured data sovereignty.

[Ymatics](https://ymatics.com/) extends the EDC Connector's functionality with extensions to offer
enterprise-ready managed services like "Connector-as-a-Service", out-of-the-box fully configured DAPS
and integrations to existing other dataspace technologies.

This repository contains our Ymatics Connector.

Check out our [Getting Started Section](#getting-started) on how to run a local Ymatics Connector.


## Getting Started(Local Demo)
You need Docker and Docker Compose to start local demo.
```angular2html
sudo apt update

sudo apt install apt-transport-https ca-certificates curl software-properties-common

curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -

sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu bionic stable"

sudo apt update

sudo apt install docker-ce

sudo curl -L "https://github.com/docker/compose/releases/download/latest/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose

sudo chmod +x /usr/local/bin/docker-compose

sudo ln -s /usr/local/bin/docker-compose /usr/bin/docker-compose

docker-compose --version
```
You should login to [ghcr.io](https://github.com/features/actions) before start.
```angular2html
docker login ghcr.io -u username --password "Access Token Value"
```
Clone our repository first
```angular2html
git clone https://github.com/Ymatics-Co/yms-mvds.git
```
Then, build frontend.
```angular2html
cd connector-ui
chmod +x ./build-front.sh
source ./build-front.sh
```
After then, go to docs/deployment-guide/goals/local-demo-ce, and activate docker compose
```angular2html
cd ../docs/deployment-guide/goals/local-demo-ce
docker compose up -d --build
docker compose logs -f
```
then, happy sharing!

## Requirements
```
Docker Environment

JDK 17

GitHub Maven Registry Access

Node 20
```
To access the GitHub Maven Registry you need to provide the following properties, e.g. by providing
a `~/.gradle/gradle.properties`.

```properties
gpr.user={your github username}
gpr.key={your github pat with packages.read}
```

## Start GUI
```angular2html
- localhost:11000 : Provider connector ui
- localhost:22000 : Consumer connector ui
- localhost:4200 : Provider Datasource/sink ui
- localhost:4201 : Consumer Datasource/sink ui
- localhost:8000 : Provider Datasink Backend
- localhost:8001 : Provider Datasource Backend
- localhost:8002 : Consumer Datasink Backend
- localhost:8003 : Consumer Datasource Backend
``` 

## License

Distributed under the `LICENSE`. Some deliverables such as APIs, API Clients and Utility Libraries remain under the `Apache License 2.0`. See [LICENSE](LICENSE) for more information.

## Contact

contact@ymatics.com

<p align="right">(<a href="#readme-top">back to top</a>)</p>
