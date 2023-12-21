import {createElement} from 'react';
import {createRoot} from 'react-dom/client';
import {Server} from "Frontend/generated/endpoints";

function drawServerResponse(result: string): void {
    createRoot(document.getElementById('outlet')!).render(createElement("div", {}, result));
}

Server.getHello().then(drawServerResponse);
