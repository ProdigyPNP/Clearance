package ppnp.resources;

public class GitHubRepo {

    public static GitRepository getGitRepository (String ownerName, String repoName) {

        final String working = ownerName + "/" + repoName;

        return getGitRepository(working);
    }

    public static GitRepository getGitRepository (String repo) {

        final String working = repo;

        return new GitRepository("https://github.com/" + working + ".git");
    }

}
