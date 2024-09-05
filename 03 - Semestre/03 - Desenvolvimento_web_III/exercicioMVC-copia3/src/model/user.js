module.exports = class userModel {
  constructor() {
    this.users = []
  }

  save(user){
    this.users.push(user)
  }
  getAll(){
    return this.users;
  }

  delete(email){
    this.users = this.users.filter((user) => (user.email !== email) );
    return this.users;
  }
}
