/*
 * Permission to use, copy, modify, and/or distribute this software for any 
 * purpose with or without fee is hereby granted.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR(S) DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR(S) BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION
 * OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN
 * CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */
package jakartaee.examples.jsf.sessionmap;

import java.io.Serializable;
import java.util.Map;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.annotation.SessionMap;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * A request scoped bean injecting the session map.
 * 
 * @author Manfred Riem (mriem@manorrock.com)
 */
@Named(value = "sessionMapBean")
@RequestScoped
@FacesConfig(version = FacesConfig.Version.JSF_2_3)
public class SessionMapBean implements Serializable {
    
    /**
     * Stores the application map.
     */
    @Inject
    @SessionMap
    private Map<String, Object> sessionMap;
    
    /**
     * Get the view map.
     * 
     * @return the view map.
     */
    public Map<String, Object> getSessionMap() {
        return sessionMap;
    }
}
