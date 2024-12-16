g# Branch protection
to set a rule -> settings -> rules -> ruleset

for now only main branch is protected and:
-it can't be deleted
-requires pr to merge (min approval is now set to 0)
-refuse force push (i think without bypass list this is useless)

create pr from cli using gh cli

gh pr create --base <branch where to merge> --head <branch with modification to merge> --title "..." --body "..."

https://www.wartremover.org/doc/install-setup.html
https://scalameta.org/scalafmt/docs/configuration.html

how to update hooks before compiling? sbt watch sus

// delete branch locally
git branch -d localBranchName

// delete branch remotely
git push origin --delete remoteBranchName


3.2. Tags
To include different kinds of information in Scaladoc, we can use pre-defined tags:

@author specifies the author of the class
@constructor provides an explanation for the constructor
@param provides any useful description about a method’s parameter or input it should expect
@return provides a description of what a method will or can return
@since specifies which version the class, field, or method was added to the project
@version specifies the version of the software, commonly used with %I% and %G% macros
@throws is used to further explain the cases in which the software may expect an exception
@deprecated gives an explanation of why code was deprecated, when it may have been deprecated, and what the alternatives are
@todo is used to document pending items for a method or class

sbt doc

