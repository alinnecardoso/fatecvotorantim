module.exports = class userModel {
  constructor() {
    this.users = []
  }

  save(user){
    this.users.push(user);
  }

  getAll(){
    return this.users
  }
}