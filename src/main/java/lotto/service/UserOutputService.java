package lotto.service;

import lotto.domain.LottoTicket;
import lotto.domain.Prompter;

public class UserOutputService {
    private final Prompter prompter;

    public UserOutputService(Prompter prompter) {
        this.prompter = prompter;
    }

    public void printPurchasedLottoTicket(LottoTicket lottoTicket) {
        this.prompter.showOutputPurchaseCountPrompt(lottoTicket.size());
        this.prompter.showMessage(lottoTicket.toString());
    }
}