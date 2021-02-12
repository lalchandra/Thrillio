package com.semanticsquare.Thirllio.controllers;

import com.semanticsquare.Thrillio.entities.Bookmark;
import com.semanticsquare.Thrillio.entities.User;
import com.semanticsquare.Thrillio.managers.BookmarkManager;

public class BookmarkController {
    private static BookmarkController instance = new BookmarkController();
    private BookmarkController() {}
    
    public static BookmarkController getInstance() {
    	return instance;
    }

	public void saveUserBookmark(User user, Bookmark bookmark) {
	  BookmarkManager.getInstance().saveUserBookmark(user,bookmark);
		
	}

	
    
    
}
