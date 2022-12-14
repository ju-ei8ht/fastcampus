# 패스트캠퍼스
## 메가바이트스쿨 BE 4기
### :date: Period
2022.12 12 ~   

### :books: Stacks   
<img src="https://img.shields.io/badge/IntelliJ-000000?style=flat-square&logo=IntelliJIDEA&logoColor=ffffff"/> <img src="https://img.shields.io/badge/VisualStudioCode-007ACC?style=flat-square&logo=VisualStudioCode&logoColor=ffffff"/> <img src="https://img.shields.io/badge/GIT-E44C30?style=flat-square&logo=Git&logoColor=ffffff"/> <img src="https://img.shields.io/badge/Spring-6DB33F?style=flat-square&logo=Spring&logoColor=ffffff"/> <img src="https://img.shields.io/badge/HTML5-E34F26?style=flat-square&logo=HTML5&logoColor=ffffff"/> <img src="https://img.shields.io/badge/CSS3-1572B6?style=flat-square&logo=CSS3&logoColor=ffffff"/> <img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=flat-square&logo=JavaScript&logoColor=ffffff"/>

[badge](https://github.com/alexandresanlim/Badges4-README.md-Profile)   
[emoji](https://github.com/ikatyang/emoji-cheat-sheet)

### :computer: Study
#### :octocat: Git   

[:file_folder: Git, Github (1)](https://www.notion.so/Git-Github-1-c8b14b95630145869ba6b4232ecc18ca)   

```bash
mkdir [new folderName]
rm -rf [delete folderName]
git init
git remote add origin [repo addr]
git add .
git commit -m"[commit comment]"
git log --oneline
git revert [revert version]
git reset --soft/hard/mixed [reset version]
git push/pull origin [branch]
git branch -m [branch]
git clone [repo addr]
```   
> **VsCode 단축키**   
> ctrl + shift + ~ : TERMINAL ON   

---

[:file_folder: Git, Github (2)](https://www.notion.so/Git-Github-2-8f799ae773584aaf821c123e2cd87913)

```bash
git config --global init.defaultBranch main
//git init하면 default branch main으로
git branch -m main
//branch를 main으로
git switch -c [new branchName]
git switch [branchName]
//checkout보다 switch
git branch --list
git branch -d [delete branchName]
```

[:bookmark_tabs: Github default branch 변경하기 (master to main)](https://www.hahwul.com/2021/07/17/changing-the-github-default-branch/)

```bash
git branch -m master main
git push -u origin main
```
clone의 경우
```bash
git branch -m master main
git fetch origin
git branch -u origin/main main
git remote set-head origin -a
```

[:bookmark_tabs: How do I delete a Git branch locally and remotely?](https://stackoverflow.com/questions/2003505/how-do-i-delete-a-git-branch-locally-and-remotely)

```bash
git push -d [remote_name] [branchName]
git branch -d [branchName]
```
**Note:** In most cases, [remote_name] will be origin.