<a name="readme-top"></a>
<br />
<div align="center">
<a href="https://github.com/YMSAISolutionDev1/yms-mvds">
<img src="connector-ui/src/assets/images/ymatics_logo.svg" alt="Logo" width="300">
</a>

<h3 align="center">Ymatics Connector</h3>
<p align="center" style="padding-bottom:16px">
Extended EDC Connector by Ymatics.
<br />
<a href="https://github.com/YMSAISolutionDev1/yms-mvds/issues/new?template=bug_report.md">Report Bug</a>
·
<a href="https://github.com/YMSAISolutionDev1/yms-mvds/new?template=feature_request.md">Request Feature</a>
</p>
</div>

<details>
   <summary>Table of Contents</summary>
   <ol>
      <li><a href="#about-the-project">About The Project</a></li>
      <li><a href="#getting-started">Getting Started</a></li>
      <li><a href="#compatibility">Compatibility</a></li>
      <li><a href="#contributing">Contributing</a></li>
      <li><a href="#license">License</a></li>
      <li><a href="#contact">Contact</a></li>
   </ol>
</details>

## About The Project

[Eclipse Dataspace Components](https://github.com/eclipse-edc) (EDC) is a framework
for building dataspaces, exchanging data securely with ensured data sovereignty.

[ymatics](https://ymatics.com/) extends the EDC Connector's functionality with extensions to offer
enterprise-ready managed services like "Connector-as-a-Service", out-of-the-box fully configured DAPS
and integrations to existing other dataspace technologies.

This repository contains our Ymatics Connector.

Check out our [Getting Started Section](#getting-started) on how to run a local Ymatics Connector.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Getting Started

The fastest way to get started is our [Getting Started Guide](docs/getting-started/README.md).

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Compatibility

Our Ymatics Connector is compatible with productive Tractus-X versions. We stay in sync with the Eclipse EDC that Tractus-X is using.

Some parallel versions might be maintained, although done as sparingly as possible.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Contributing

Contributions are what make the open source community such an amazing place to
learn, inspire, and create. Any contributions you make are **greatly
appreciated**.

If you have a suggestion that would improve this project, feel free to open
a [feature request](https://github.com/YMSAISolutionDev1/yms-mvds/issues/new?template=feature_request.md). Don't forget to
leave the project a ⭐, if you like the effort put into this version!

Our contribution guideline can be found in [CONTRIBUTING.md](CONTRIBUTING.md).

<p align="right">(<a href="#readme-top">back to top</a>)</p>

#### Requirements

- Docker Environment
- JDK 17
- GitHub Maven Registry Access
- Node 20

To access the GitHub Maven Registry you need to provide the following properties, e.g. by providing
a `~/.gradle/gradle.properties`.

```properties
gpr.user={your github username}
gpr.key={your github pat with packages.read}
```

### Local Development: Backend

The backend can be developed fully using tests.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Local Development: Frontend

As soon as the API model is ready the
[Fake Backend](connector-ui/src/app/core/services/api/fake-backend/edc-fake-backend.ts)
can be adjusted. The fake backend is mostly type-safe by using the generated API model classes and mappers.

To launch the frontend dev server with the Fake Backend, run:

```shell script
# Bash, Git Bash or WSL

# Install dependencies (only required once)
(cd connector-ui && npm i)

# Run the dev server with Fake Backend (Local Development)
# Also regenerates the API Client Library
(cd connector-ui && npm run cold-start)
```

This starts the frontend at http://localhost:3000

The configuration can be found in [connector-ui/.env.local-dev](connector-ui/.env.local-dev).

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## License

Distributed under the `LICENSE`. Some deliverables such as APIs, API Clients and Utility Libraries remain under the `Apache License 2.0`. See [LICENSE](LICENSE) for more information.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Contact

contact@ymatics.com

<p align="right">(<a href="#readme-top">back to top</a>)</p>
