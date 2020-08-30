package service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Blog;

public class CRUDOperations {
	static List<Blog> list=new ArrayList<Blog>(); // Store the blog in the list
	
	public List<Blog> createBlog(Blog blog) throws IOException {
		list.add(blog);
		System.out.println(list);
		return list;
	}
	
	public List<Blog> viewBlog(Blog blog) throws IOException{
		System.out.println(list);
		return list;
		
	}
	public List<Blog> updateBlog(Blog blog) throws IOException{
		list.sort(Comparator.naturalOrder());
		return list;
	
	}
	public List<Blog> deleteBlog(Blog blog) throws IOException{
		return null;
		
	}
}
