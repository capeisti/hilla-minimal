import {createElement} from 'react';
import {createRoot} from 'react-dom/client';
import {Application} from "Frontend/generated/endpoints";

function drawServerResponse(result: string): void {
    createRoot(document.body).render(createElement("div", {}, result));
}

Application.getSomething().then(drawServerResponse);
