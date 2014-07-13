package action;

import entity.*;
import parser.Parser;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public class ParseAction implements Action {

    @Override
    public String execute(HttpServletRequest request) {
        String text = request.getParameter("text");
        Text nText = Parser.parseText(text);

        List<Sentence> sentences = new ArrayList<>();
        for (int i = 0; i < nText.getElements().size(); i++) {
            sentences.addAll(nText.getElements().get(i).getElements());
        }

        request.setAttribute("text", nText);
        request.setAttribute("paragraph", nText.getElements());
        request.setAttribute("sentence", sentences);

        return "/WEB-INF/result.jsp";
    }
}
