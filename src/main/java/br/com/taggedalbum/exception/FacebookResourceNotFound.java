package br.com.taggedalbum.exception;

/**
 * Created by rafaelperetta on 8/23/16.
 */
public class FacebookResourceNotFound extends ResourceNotFoundException {

    public FacebookResourceNotFound(String message, Long id) {
        super(message, id);
    }
}
