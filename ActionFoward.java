package service;

public class ActionFoward {

	private boolean redirect;		// fowarding 방법 설정
	private String path;			// fowarding 파일위치 설정
	
	public boolean isRedirect() {
		return redirect;
	}
	public void setRedirect(boolean redirect) {
		this.redirect = redirect;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
}
