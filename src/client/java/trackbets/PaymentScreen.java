package trackbets;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

public class PaymentScreen extends Screen {

    public PaymentScreen(Text title) {
        super(title);
    }

    @Override
    protected void init() {
        int y = 40;
        int rowHeight = 25;

        for (PaymentManager.Payment payment : PaymentManager.PAYMENTS) {
            ButtonWidget removeBtn = ButtonWidget.builder(Text.of("X"), button -> {
                PaymentManager.removePayment(payment);
                this.init();
            })
            .dimensions(this.width / 2 + 100, y, 20, 20)
            .build();

            this.addDrawableChild(removeBtn);
            y += rowHeight;
        }

        this.addDrawableChild(ButtonWidget.builder(Text.of("Close"), button -> this.close())
            .dimensions(this.width / 2 - 50, this.height - 30, 100, 20)
            .build());
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        this.renderBackground(context);
        context.drawCenteredTextWithShadow(this.textRenderer, this.title, this.width / 2, 10, 0xFFFFFF);

        int y = 45;
        int rowHeight = 25;

        for (PaymentManager.Payment payment : PaymentManager.PAYMENTS) {
            String displayString = payment.name() + " paid: $" + payment.amount();
            context.drawTextWithShadow(this.textRenderer, displayString, this.width / 2 - 120, y, 0x00FF00);
            y += rowHeight;
        }

        super.render(context, mouseX, mouseY, delta);
    }
}
