# Project Setup Guide

## Cloning the Repository
To get started, clone the repository using the following command:
```sh
git clone https://github.com/LunguIon/java-tasks.git
cd https://github.com/LunguIon/java-tasks.git
```

## Setting Up the Project in IntelliJ IDEA
1. Open IntelliJ IDEA.
2. Click on **File > Open**, then select the cloned project folder.
3. Open the **Maven** tab (on the right side of IntelliJ).
4. Run the **clean** task to remove previous builds:
   ```sh
   mvn clean
   ```
5. Run the **install** task to install all dependencies:
   ```sh
   mvn install
   ```

## Creating a Feature Branch
Before making any changes, create a new feature branch:
```sh
git checkout -b feature-<task-number>
```
Replace `<your-feature-name>` with a meaningful name for your changes.

## Making Changes
1. Modify the necessary files and implement the required changes.
2. Run tests to ensure everything works correctly:
   ```sh
   mvn test
   ```

## Pushing Your Changes to Remote Repository
Once you have completed the feature implementation, push your branch to the remote repository:
```sh
git add .
git commit -m "Added feature: <description>"
git push origin feature-<your-feature-name>
```

## Creating a Pull Request (PR)
1. Go to the repository on GitHub/GitLab.
2. Navigate to the **Pull Requests** section.
3. Click on **New Pull Request**.
4. Select `feature-<task-number>` as the source branch and `main` as the target branch.
5. Add **LunguIon** as a reviewer.
6. Add a meaningful title and description.
7. Click **Create Pull Request**.

## Awaiting Review
Once the PR is submitted, wait for the review and feedback. Make changes if necessary before merging into the main branch.

Happy coding! 🚀
