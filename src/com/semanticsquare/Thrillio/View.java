package com.semanticsquare.Thrillio;

import com.semanticsquare.Thirllio.controllers.BookmarkController;
import com.semanticsquare.Thrillio.entities.Bookmark;
import com.semanticsquare.Thrillio.entities.User;

public class View {
     public static void bookmark(User user, Bookmark[][] bookmarks) {
    	 System.out.println("\n"+  user.getEmail()+ "is bookmarking");
    	 for(int i=0;i<DataStore.USER_BOOKMARK_LIMIT;i++) {
    		 int typeOffSet=(int)(Math.random()*DataStore.BOOKMARK_TYPES_COUNT);
    		 int bookmarkOffSet=(int)(Math.random()*DataStore.BOOKMARK_COUNT_PER_TYPE);
    		 
    		 Bookmark bookmark = bookmarks[typeOffSet][bookmarkOffSet];
    		 BookmarkController.getInstance().saveUserBookmark(user, bookmark);
    		 
    		 System.out.println(bookmark);
    	 }
     }
}
