package com.semanticsqaure.Thrillio.dao;

import com.semanticsquare.Thrillio.DataStore;
import com.semanticsquare.Thrillio.entities.Bookmark;
import com.semanticsquare.Thrillio.entities.UserBookmark;

public class BookmarkDao {
   public Bookmark[][] getBookmarks(){
	   return DataStore.getBookmarks();
   }

public void saveUserBookmark(UserBookmark userBookmark) {
	DataStore.add(userBookmark);
	
}
}
