package ppnp.resources;

public enum role {

    /** Can read and clone this repository. Can also open and comment on issues and pull requests. */
    Read,

    /** Can read and clone this repository. Can also manage issues and pull requests. */
    Triage,

    /** Can read and clone this repository. Can also manage issues and pull requests. */
    Write,

    /** Can read, clone, and push to this repository. They can also manage issues, pull requests, and some repository settings. */
    Maintain,

    /** Can read, clone, and push to this repository. Can also manage issues, pull requests, and repository settings, including adding collaborators. */
    Admin,
}
