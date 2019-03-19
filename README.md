# BigData
# sparkDemo using maven repository

git

git config --global user.email "esdineshkumar@gmail.com"
git config --global user.name "yesdinesh"

#create empty git dir
git init

# add all files
git add --all

# check the status
git status

# commit the git files
git commit -m "spark sample project"

# pushing the file
git remote add origin https://github.com/yesdinesh/BigData.git
git push -u origin master



### Replace a file
git add samplecode
git status
git commit -m "samplecode's code modified"
git push

### changes in repository
git pull
git add samplecode
git status
git commit -m "samplecode's code modified"
git push
