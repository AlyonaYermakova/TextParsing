package action;

import entity.Text;
import util.Parser;

import javax.servlet.http.HttpServletRequest;

public class ParseAction implements Action {

    @Override
    public String execute(HttpServletRequest request) {
        String inputText = request.getParameter("text");
        Text text = Parser.parseText(inputText);
        request.setAttribute("text", text);
        return "/WEB-INF/result.jsp";
    }
}
