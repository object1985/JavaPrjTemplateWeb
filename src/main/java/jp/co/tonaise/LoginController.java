package jp.co.tonaise;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class LoginController implements Serializable {
	/** シリアルID */
	private static final long serialVersionUID = 1L;

	private String userId;
	private String password;

	public String login() {
		FacesContext context = FacesContext.getCurrentInstance();

		// 空欄によるエラー
		if (userId.isEmpty() || password.isEmpty()) {
			context.addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR, "入力欄が空欄です", "ユーザID、パスワードを入力してください"));
			return "";
		} else {
			return "menu.xhtml";
		}
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
