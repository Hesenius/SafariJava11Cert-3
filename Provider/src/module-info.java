/*open*/ module Provider {
//  exports serviceimpl;  // "exports" a *package*
  exports serviceimpl to User, NonExistent;
//  opens serviceimpl;
  opens serviceimpl to User, NonExistent;
}
