import { Request, Response } from "express";
import { IUser } from "./user.interface";

export const getUser = (request: Request, response: Response) => {
    const { id } = request.params;
    const user: IUser = {
        id: Number(id),
        name: "João",
        age: 18
    }
    response.json(user);
};

//npm i ---save-dev typescript @types/node @types/express

// npm i -g vercel
