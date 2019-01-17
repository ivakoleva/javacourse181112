package com.musala.javacourse181112.tasks.oop.innerexercise;
 /* local class is an inner class that's defined inside of a scope
    block (usually a method or if statement)
 */


public class LocalClass {
    private String title;
    private OnClickListener onClickListener;

    public LocalClass(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void onClick() {
        this.onClickListener.OnClick(this.title);
    }

    public interface OnClickListener {
        public void OnClick(String title);
    }

}
