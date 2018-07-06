package com.mv.schelokov.car_rent.controller.actions;

/**
 *
 * @author Maxim Chshelokov <schelokov.mv@gmail.com>
 */
public class JspForward {
    private String url;
    private boolean redirect;
    
    public JspForward(String url) {
        this.url = url;
    }
    
    public JspForward(String url, boolean redirect) {
        this(url);
        this.redirect = redirect;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the redirect
     */
    public boolean isRedirect() {
        return redirect;
    }

    /**
     * @param redirect the redirect to set
     */
    public void setRedirect(boolean redirect) {
        this.redirect = redirect;
    }
    
    
}
