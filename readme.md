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
rm -rf .git
git merge [merge할 branchName]
//실무에선 command로 merge할 일은 없음
git log --oneline --graph --decorate
git merge [merge할 branchName] --no-ff
//fast-forward로 merge 안 하게
git rebase [rebase할 branchName]
git fetch --prune
//pr하고 삭제된 branch 정리
//로컬 브랜치도 -d로 삭제(띄어쓰기로 구분)
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
git push -d [remoteName] [branchName]
git branch -d [branchName]
```
**Note:** In most cases, [remoteName] will be origin.

---

[:file_folder: Git, Github (3)](https://www.notion.so/Git-Github-3-417b850c658940fc8e94e73f0bb9c2f8)

```bash
git pull [remoteName] [branchName] --no-ff
//git pull error시
```
> commit 본문을 쓰기보단 PR 본문을 쓰는 게 효율적

[:bookmark_tabs: How do I undo 'git add' before commit?](https://stackoverflow.com/questions/348170/how-do-i-undo-git-add-before-commit)

```bash
git reset [file]
```
if this tried then
```bash
fatal: Failed to resolve 'HEAD' as a valid ref.
```
solution
```bash
git rm --cached [file]
```