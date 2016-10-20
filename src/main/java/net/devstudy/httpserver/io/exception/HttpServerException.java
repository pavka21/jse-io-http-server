package net.devstudy.httpserver.io.exception;
/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class HttpServerException extends RuntimeException {
	private static final long serialVersionUID = -3277666609653136191L;
	private int statusCode = 500;

	public HttpServerException(String message) {
		super(message);
	}

	public HttpServerException(Throwable cause) {
		super(cause);
	}

	public HttpServerException(String message, Throwable cause) {
		super(message, cause);
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
}
